int evenSum = 0;
		int oddSum = 0;
		
		while (input1 != 0) {
			int temp = input1 % 10;
			
			if ( temp % 2 == 0)
      evenSum += temp;
			if  (temp % 2 == 1)
      oddSum += temp;
			
			input1 /= 10;
		}
		
		if (input2.equals("even"))
    return evenSum;
		else
    return oddSum;
	}
}
