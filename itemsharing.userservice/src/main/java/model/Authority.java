package model;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by ravipatel on 1/15/18.
 */
public class Authority implements GrantedAuthority {

    private final String authority;

    public Authority(String authority)
    {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
