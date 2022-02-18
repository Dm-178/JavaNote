package DeepClass3;

public interface Intface0 {
    /**默认方法*/
    //接口支持默认方法，一种在接口内就实例化的方法，所有实现接口的类都会获得这个默认方法
    default public void defaultfun()
    {
        System.out.println("接口的默认方法...running");
    }
}
