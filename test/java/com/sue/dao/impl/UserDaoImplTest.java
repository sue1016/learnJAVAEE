package com.sue.dao.impl; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

import com.sue.*

/**
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>八月 3, 2018</pre> 
* @version 1.0 
*/ 
public class UserDaoImplTest {
    UserDao dao;

@Before
public void before() throws Exception {
    dao = new UserDaoImpl();
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: update(User u) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: get(int id) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: save(User u) 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: Test goes here...
    User u = new User();
    u.setUsername("skx");
    u.setUsername("123");

    dao.save(u);
} 

/** 
* 
* Method: delete(int id) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: list() 
* 
*/ 
@Test
public void testList() throws Exception { 
//TODO: Test goes here... 
} 


} 
