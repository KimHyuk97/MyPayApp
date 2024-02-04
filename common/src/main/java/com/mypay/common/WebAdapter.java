package com.mypay.common;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * packageName    : common
 * fileName       : WebAdapter
 * author         : Hyuk Kim
 * date           : 2023-12-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-12-17        Hyuk Kim       최초 생성
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface WebAdapter {

    @AliasFor(annotation = Component.class)
    String value() default "";
}
