package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Supplier;

public class SupplierDAOTest {

	static SupplierDAO supplierDAO; 
	@BeforeClass
	public static void intialize(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		
		context.refresh();
		
		supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
	}
	
	@Ignore
	@Test
	public void addSupplierTest(){
		Supplier supplier = new Supplier();
		supplier.setSupplierName("ravinath");
		supplier.setSupplierAddress("china");
		assertTrue("problem in adding supplier:",supplierDAO.addSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void updateSupplierTest(){
		Supplier supplier = supplierDAO.getSupplier(14);
		supplier.setSupplierName("mani");
		supplier.setSupplierAddress("Mumbai");
		assertTrue("problem in updating supplier:",supplierDAO.updateSupplier(supplier));
	}

	@Ignore
	@Test
	public void deleteSupplierTest(){
		Supplier supplier = supplierDAO.getSupplier(14);
		supplier.setSupplierName("Samsung");
		assertTrue("problem in deleting supplier:",supplierDAO.deleteSupplier(supplier));
	}
	
	@Test
	public void listSupplier(){
		
		List<Supplier> listsupplier = supplierDAO.listSupplier();
		assertNotNull("problem in listing supplier:",listsupplier);
		
		for(Supplier supplier:listsupplier){
			System.out.print(supplier.getSupplierID()+":::");
			System.out.print(supplier.getSupplierName()+":::");
			System.out.println(supplier.getSupplierAddress());
		}
 	}
}
