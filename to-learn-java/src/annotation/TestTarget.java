package annotation;

import java.lang.annotation.*;

public class TestTarget {

    @MyAnnotation
    public class testA{
        @MyAnnotation
        private String fieldA;
    }

    /**
     * @Target 指定注解可以应用于哪些元素
     * @Retention 指定注解可以保留多长时间
     * @Document 被 @Documented 修饰，那么在使用 javadoc 命令生成文档时，该注解信息会被包含在文档中
     * @Inerited 被 @Inherited 修饰，那么它可以被子类继承
     */
    @Target({ElementType.TYPE, ElementType.FIELD, ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @Documented
    @Inherited
    public @interface MyAnnotation{

    }
}
