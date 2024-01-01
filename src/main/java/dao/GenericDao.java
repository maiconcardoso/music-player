package dao;

import java.util.List;

public interface GenericDao {
	
	public void create(Object o);
	public Object read(Object o);
	public List<Object> readAll(Object o);
	public void update(Object o);
	public void delete (Object o);

}
