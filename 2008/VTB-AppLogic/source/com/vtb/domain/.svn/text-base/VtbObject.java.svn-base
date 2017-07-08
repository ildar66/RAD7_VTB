package com.vtb.domain;

import java.io.Serializable;

import com.vtb.exception.MappingException;
import com.vtb.mapping.Mapper;
import com.vtb.mapping.MapperFactory;



/**
 * Root domain object in the system VTB.
 * @author IShafigullin
 */
public class VtbObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7238336210646588332L;
	private transient Mapper mapper = null;

	/**
	 * VtbObject constructor.
	 */
	public VtbObject() {
		super();
	}

	public Mapper getMapper() throws MappingException {
		if (mapper == null) {
			try {
				mapper = MapperFactory.getSystemMapperFactory().getMapper(this.getClass());
				if (mapper == null)
					throw new MappingException("Can't find system mapper for class "+this.getClass().getName());
			} catch(Exception e) {
				mapper = MapperFactory.getReserveMapperFactory().getMapper(this.getClass());
				if (mapper == null)
					throw new MappingException("Can't find reserve mapper for class "+this.getClass().getName());
			}		
		}		
		return mapper;
	}
}
