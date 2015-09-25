package remotedisplay.law.myfifthgitapp.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/9/25.
 */
public class TData implements Serializable
{
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    private String name;
    private String address;
}
