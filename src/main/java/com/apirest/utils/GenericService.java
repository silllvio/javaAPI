package com.apirest.utils;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*Todo serviço será crido baseado em uma entidade que já herda do BaseEntity*/
public abstract class GenericService<T extends BaseEntity<ID>, ID extends Serializable> implements ServiceMap {

	private final Logger LOGGER = Logger.getLogger(getClass());

	@Autowired
	protected JpaRepository<T, ID> genericRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<T> findAll() {
		this.LOGGER.info("Requesting all records.");
		return this.genericRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public T insert(@RequestBody T entity) {

		this.LOGGER.info(String.format("Saving the Entity [%s]", entity));

		entity.setId(null); // O método Save tanto atualiza quanto salva um novo
							// registro. Quando existe um id, significa que é
							// uma atualização.

		return this.genericRepository.save(entity);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public T update(@RequestBody T entity) {
		this.LOGGER.info(String.format("Updatig the entity [%s]", entity));
		if (entity.getId() == null) {
			this.LOGGER.error("Objeto não existe");
			return null;
		}
		return this.genericRepository.save(entity);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody T entity) {

		this.LOGGER.info(String.format("Deleting the entity [%s]", entity));
		this.genericRepository.delete(entity);
	}
}
