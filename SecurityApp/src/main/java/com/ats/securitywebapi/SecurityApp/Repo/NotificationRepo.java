package com.ats.securitywebapi.SecurityApp.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.ats.securitywebapi.SecurityApp.model.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Integer>{



	@Transactional
	@Modifying
	@Query("update Notification set del_status=0  WHERE notification_id=:notificationId")
	int deleteNotification(int notificationId);

	List<Notification> findByDelStatusOrderByNotificationIdDesc(int i);

	Notification findByNotificationIdAndDelStatusOrderByNotificationIdDesc(int notificationId, int i);
}
