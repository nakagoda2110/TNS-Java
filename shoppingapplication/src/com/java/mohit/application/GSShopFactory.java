package com.java.mohit.application;

import com.java.mohit.framework.ShopFactory;
import com.java.mohit.framework.NormalAcc;
import com.java.mohit.framework.PrimeAcc;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeacc = new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		NormalAcc normalacc = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		return normalacc;
	}
	

}