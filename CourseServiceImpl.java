/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.academy.service.impl;

import com.leapfrog.academy.dao.CourseDAO;
import com.leapfrog.academy.dao.impl.CourseDAOImpl;
import com.leapfrog.academy.entity.Course;
import com.leapfrog.academy.service.CourseService;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public class CourseServiceImpl implements CourseService {
    private CourseDAO courseDAO=new CourseDAOImpl();

    @Override
    public int insert(Course c) throws SQLException, ClassNotFoundException {
        return courseDAO.insert(c);
    }

    @Override
    public int update(Course t) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course getbyId(int id) throws SQLException, ClassNotFoundException {
        return courseDAO.getbyId(id);
    }

    @Override
    public List<Course> getAll(boolean show) throws SQLException, ClassNotFoundException {
        return courseDAO.getAll(show);
    }

    @Override
    public int count() throws SQLException, ClassNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
