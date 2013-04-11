package com.tutushare.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.tutushare.entity.user.Role;
import com.tutushare.entity.user.User;
import com.tutushare.service.UserService;

public class MyRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	/**
	 * 授权信息
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {

		String username = (String) principals.fromRealm(getName()).iterator().next();

		if (username != null) {
			User user = userService.find(username);

			if (user != null && user.getRoles() != null) {
				SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
				for (Role role : user.getRoles()) {
					info.addRole(role.getName());
					info.addStringPermissions(role.getPermissionStr());
				}
				return info;
			}
		}
		return null;
	}

	/**
	 * 认证信息
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;

		String userName = token.getUsername();
		if (userName != null && !"".equals(userName)) {

//			User user = userService.login(token.getUsername(),
//					String.valueOf(token.getPassword()));
			User user = null;
			if (user == null) {
				throw new UnknownAccountException("用户不存在");
			} else {
				return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
			}
		}
		return null;
	}
}
