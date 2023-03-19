package com.userInfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userInfo.entities.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

}
