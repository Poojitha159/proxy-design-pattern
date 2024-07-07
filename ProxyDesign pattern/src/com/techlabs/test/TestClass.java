package com.techlabs.test;

import com.techlabs.model.Cash;
import com.techlabs.model.credit;
import com.techlabs.model.debit;
import com.techlabs.model.payment;

public class TestClass {

	public static void main(String[] args) {

payment p=new  credit();
p.payment();


p=new debit();
p.payment();

p=new Cash();
p.payment();
	}

}
