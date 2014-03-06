package hellotwu.mappers;

import org.apache.ibatis.annotations.Select;

public interface HelloMapper {

    @Select("select 'Hello TWU!!'")
    public String getGreeting();

}
