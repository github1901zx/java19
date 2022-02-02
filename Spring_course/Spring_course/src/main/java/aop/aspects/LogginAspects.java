package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LogginAspects {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods()")
    public void bedoreBookAdvice(){
        System.out.println("Попытка получить книгу");
    }
    @Pointcut("execution(* add*(*))")
    public void alladdMethods(){}


    @Before("alladdMethods()")
    public void addBookAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println(methodSignature);
        System.out.println(methodSignature.getMethod());
        System.out.println(methodSignature.getName());
        System.out.println(methodSignature.getReturnType());

        System.out.println("Попытка добавить книгу");
    }

}
