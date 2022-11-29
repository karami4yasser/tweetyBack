package com.tweety.feedservice.feignproxy;

import com.tweety.feedservice.dto.UserIdListDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-service")
public interface UserServiceProxy {

    @GetMapping("/api/follow/following/id-list/{UserId}")
    public ResponseEntity<UserIdListDto> getFollowingIdList(
            @PathVariable Long UserId );
}
