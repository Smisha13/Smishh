int sum=0,temp,r;    
  int n=input1;
  temp=n;
 while(n>0)
 {    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   return 2;
  else    
   return 1;    
}  
} 
