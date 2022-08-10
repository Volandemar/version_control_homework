## Принцип работы менеджера продаж (***класса <span style="color:yellow">SalesManager***</span>)

 Класс состоит из конструктора, который принимает на вход массив из данных о стоимости проданных товаров:

```java
public SalesManager(int[] sales) {
    this.sales = sales;
}
```


и метода поиска максимального значения цены из указанного массива:

```java
public int max(){
    int max=-1;
    for(int sale:sales){
        if(sale>max){
            max=sale;
        }
    }
    return max;
}
```

 В классе <span style="color:yellow">***Main***</span> задается начальный массив 
 цен <span style="color:red">*sales*</span> и выводится в консоль результат 
 выполнения метода <span style="color:red">*max*</span> 
 класса <span style="color:yellow">***SalesManager***</span> для этого массива
