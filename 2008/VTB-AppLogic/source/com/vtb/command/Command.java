package com.vtb.command;

import java.io.Serializable;

import com.vtb.exception.ModelException;

/**
 * @author IShafigullin
 */
public interface Command extends Serializable {
	public void execute() throws ModelException;
}
