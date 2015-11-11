package dev.xwolf.biz.uc.mgr;

import java.util.List;

import dev.xwolf.biz.uc.entity.Role;

public interface RoleMgt {	
	
	public void add(Role role);
	
	public void del(String roleId);
	
	public void update(Role role);
	
	public List<Role> listAll();
	
	public List<Role> list(String roleGroupId);
	
	public Role getRole(String roleId);
	

}
