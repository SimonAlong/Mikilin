package com.simonalong.mikilin.isNull.notNull;

import com.simonalong.mikilin.annotation.Matcher;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author shizi
 * @since 2020/6/18 5:11 PM
 */
@Data
@Accessors(chain = true)
public class IsNullEntity2 {

    @Matcher(isNull = "false")
    private String name;

    @Matcher(isNull = "false")
    private Integer age;
}
