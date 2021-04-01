package com.simonalong.mikilin.enumtype;

import com.simonalong.mikilin.annotation.Matcher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author zhouzhenyong
 * @since 2019/4/13 下午9:41
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class EnumTypeEntity1 {

    @Matcher(enumType = AEnum.class)
    private String name;

    @Matcher(enumType = AEnum.class)
    private Integer index;

    @Matcher(enumType = {AEnum.class, BEnum.class})
    private String tag;

    @Matcher(enumType = {CEnum.class}, accept = false)
    private String invalidTag;
}
