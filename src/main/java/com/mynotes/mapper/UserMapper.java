package com.mynotes.mapper;

import com.mynotes.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * UserMapper interface defines methods
 *
 * 1. insert new users
 * 2. find by email
 * 3. find by id
 * 4. find by account
 *
 */
@Mapper
public interface UserMapper {

    /**
     * 1. Insert new user
     * @param user, including account, username, passoword, email.
     * @return
     */
    int insert(User user);

    /**
     * 2. find by email
     * @param email
     * @return return user, otherwise null
     */
    User findByEmail(@Param("email") String email);

    /**
     * 3. find by userId
     * @param userId
     * @return
     */
    User findById(@Param("userId") Long userId);

    /**
     * 4. find by account
     * @param account
     * @return
     */
    User findByAccount(@Param("account") String account);



}
