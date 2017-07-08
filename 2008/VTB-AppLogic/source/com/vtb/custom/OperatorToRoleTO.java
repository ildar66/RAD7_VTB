package com.vtb.custom;

import com.vtb.domain.Role;

public class OperatorToRoleTO {
	private Role vo = null;
	private String status = null;
	private String processName = null;

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String active) {
		this.status = active;
	}

	public OperatorToRoleTO(Role aVO) {
		super();
		setVo(aVO);
	}

	public Role getVo() {
		return vo;
	}

	private void setVo(Role vo) {
		this.vo = vo;
	}

}
