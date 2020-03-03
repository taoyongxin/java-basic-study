##类适配器模式介绍
基本介绍 ：***Adapter类***，通过继承src类，实现dsr类接口，完成src->dst的适配。
##类适配器模式应用实例
* 应用实例说明 以生活中充电器的例子来讲解适配器，充电器本身相当于Adapter，220V交流电相当于src（即被适配者）
我们的dst（即 目标）是5V直流电
* 思路分析图解
* 代码实现
##类适配器模式注意事项和细节
* Java是单继承机制，所以类适配器需要继承src类这一点算是一个缺点，因为这要求dst必须是接口，有一定的局限性；
* src类的方法在Adapter中都会暴露出来，也增加了使用的成本。
* 由于其继承了src类，所以它可以根据需要重写src类的方法，使得Adapter的灵活性增强了。

