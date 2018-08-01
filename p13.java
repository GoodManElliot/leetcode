class Solusion{
	public int romanToInt(string s){
		if(s==null || s.length()==0) 
			return 0;
		int result=0;
		int flag = 0;
		Map m = new HashMap();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
		for(i=s.length()-1 ; i>=0; i--){
			if(map.get(charAt(i)) < map.get(charAt(i-1))){
				result += map.get(charAt(i));
				flag=0;
			}
			else if (map.get(charAt(i)) = map.get(charAt(i-1))){
				if(flag == 1)
					result -= map.get(charAt(i));
				else
					result += map.get(charAt(i));
			}
			else{
				flag = 1;
				result -= map.get(charAt(i));
			}
		}
		return result;
	}
}

Solusion s = new Solusion("III");
System.out.printf(s.result);