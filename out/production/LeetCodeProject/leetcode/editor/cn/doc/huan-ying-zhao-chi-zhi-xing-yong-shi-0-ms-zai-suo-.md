### 解题思路
此处撰写解题思路
  反转的思路大同小异，利用x%10：取余得到最右边的数，即个位数值。
                    利用x/10: 除去最右边的数，即整体右移一位。
  本题的关键点在于整数计算溢出的判断。
	 （1）第一个是整数相乘溢出判断。
			if(OutValue > (INT_MAX/10) || OutValue < (INT_MIN/10) )
			     return 0;
		      OutValue = OutValue*10;
		（OutValue乘10前的值）<（有符号整形的最大值除10） 
        或（OutValue乘10前的值）<（有符号整形的最大值除10）
         INT_MAX/10（该宏在limits.h中定义），这个判断保证了之后OutValue*10不会溢出。
	 （2）两数相加是否溢出判断
		if(OutValue < 0 && remainder_x < 0 && OutValue >0)
			return 0;
		if(OutValue > 0 && remainder_x > 0 && OutValue <0)
			return 0;
         符号相同的数相加, 结果与相加的数符号不同, 则表示溢出. 
        

			

### 代码

```c
int reverse(int x){
	int OutValue = 0;
	int remainder_x = 0;
	while( x != 0)
	{
		 
		/*
		**INT_MAX and INT_MIN ara in include in "limits.h". 
		** Use the INT_MAX and INT_MIN to determine wether 	(Outvalue*10) overflows
		*/
		if(OutValue > (INT_MAX/10) || OutValue < (INT_MIN/10) )
			return 0;
			
		OutValue = OutValue*10; 
		remainder_x =( x % 10) ;
		OutValue = OutValue + remainder_x;
		
		/*
		**Determine if the sum of OutValue and remainder_x will overflow.
		*/
		if(OutValue < 0 && remainder_x < 0 && OutValue >0)
			return 0;
		if(OutValue > 0 && remainder_x > 0 && OutValue <0)
			return 0;
		
		x = x/10;
	}
	
	return OutValue;
	
	
}
```