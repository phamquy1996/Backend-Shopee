package com.backendshopee.service.impl;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendshopee.entity.BillDetailEntiy;
import com.backendshopee.entity.BillEntity;
import com.backendshopee.entity.CartDetailEntity;
import com.backendshopee.entity.CartEntity;
import com.backendshopee.entity.ClassifyEntity;
import com.backendshopee.entity.SubClassifyEntity;
import com.backendshopee.entity.UserEntity;
import com.backendshopee.repository.BillDetailRepository;
import com.backendshopee.repository.BillRepository;
import com.backendshopee.service.IBillService;
import com.backendshopee.service.IUserService;

@Service
public class BillService implements IBillService {

	@Autowired
	IUserService iUserService;

	@Autowired
	BillRepository billRepository;

	@Autowired
	BillDetailRepository billDetailRepository;

	@Override
	public void checkout() {
		UserEntity user = iUserService.findByName("admin");
		Date date = new Date(0);
		for (CartEntity item : user.getCarts()) {
			if (!item.getCartDetails().isEmpty()) {
				BillEntity billEntity = new BillEntity();
				billEntity.setUser(user);
				billEntity.setUser_buyer(item.getUser_buyer());
				billEntity.setDate_order(date);
				billEntity.setType_payment(1);
				billRepository.save(billEntity);
				int total = 0;
				if (!item.getCartDetails().isEmpty()) {
					for (CartDetailEntity cartdetail : item.getCartDetails()) {
						if ((int) cartdetail.getStatus() > 0) {
							BillDetailEntiy billDetailEntity = new BillDetailEntiy();
							billDetailEntity.setProduct(cartdetail.getProduct());
							billDetailEntity.setBill(billEntity);
							billDetailEntity.setQty(cartdetail.getQty());
							billDetailEntity.setClassify_id(cartdetail.getClassify_id());
							billDetailEntity.setSubclassify_id(cartdetail.getSubclassify_id());
							billDetailRepository.save(billDetailEntity);
							if (cartdetail.getClassify_id() != null && cartdetail.getSubclassify_id() == null) {
								for (ClassifyEntity classify : cartdetail.getProduct().getClassifyEntity()) {
									if (classify.getId() == (long) cartdetail.getClassify_id()) {
										total += classify.getPrice() * cartdetail.getQty();
									}
								}
							} else if (cartdetail.getClassify_id() != null && cartdetail.getSubclassify_id() != null) {
								for (SubClassifyEntity subclassify : cartdetail.getProduct().getSubClassifies()) {
									if (subclassify.getId() == (long) cartdetail.getSubclassify_id()) {
										total += subclassify.getPrice() * cartdetail.getQty();
									}
								}
							} else if (cartdetail.getClassify_id() == null && cartdetail.getSubclassify_id() == null) {
								total += cartdetail.getQty() * cartdetail.getProduct().getPrice();
							}

						}
					}
				}

			}
		}
	}

	@Override
	public BillEntity findById(Long id) {
		// TODO Auto-generated method stub
		return billRepository.findById(id).get();
	}

}
