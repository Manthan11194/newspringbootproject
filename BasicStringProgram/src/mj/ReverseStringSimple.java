package mj;

public class ReverseStringSimple {

		public static void main(String[] args)
		{
			String str = "1234";

			StringBuffer sbr = new StringBuffer(str);
		
			sbr.reverse();
			System.out.println(sbr);
		}
	}

