package com.iamshingie.supportportal.enums;

import com.iamshingie.supportportal.constant.Authority;

public enum Role {
    USER_ROLE(Authority.USER_AUTHORITIES),
    HR_ROLE(Authority.HR_AUTHORITIES),
    MANAGER_ROLE(Authority.MANAGER_AUTHORITIES),
    ADMIN_ROLE(Authority.ADMIN_AUTHORITIES),
    SUPER_ADMIN_ROLE(Authority.SUPER_ADMIN_AUTHORITIES);

    private final String[] authorities;

    Role(String... authorities){
        this.authorities = authorities;
    }

    public String[] getAuthorities(){
        return authorities;
    }

}
