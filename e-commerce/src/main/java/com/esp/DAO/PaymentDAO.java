package com.esp.DAO;

import java.util.List;

import com.esp.Entity.payment;

public interface PaymentDAO {
	public List<payment> getAllPaimt();

	public payment getPamnt(Long id);

	public void deletepaiemt(payment pmnt);

	public payment updateOne(payment pmnt);

	public payment ajoutPmnt(payment pmnt);

}
