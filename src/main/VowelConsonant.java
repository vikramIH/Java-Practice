package main;

public class VowelConsonant {
	public static String[] func(String str){
		String[] res = new String[str.length()];
		
		for (int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z')
			{	switch(c)
				{
				case 'a': case 'A': case 'E': case 'I': case 'O': case 'U':
				case 'e':
				case 'i':
				case 'o':
				case 'u':res[i] = "v";
				break;
				default: res[i] = "c";
				}
			}	
			else
				res[i] = "i";
		}
	return res;
    }
}