package aws;

/**
 * @author 212720190
 * @date Aug 5, 2019
 */
public class FaceRecognition {

	public static void main(String[] args) {/*
	
		boolean flag=true;
        if(num<=0)
            return false;
        else {
            int[] arr = new int[100];
            int k=0;
            while(num%2==0) {
            arr[k++]=2;
                num/=2;
            }
            for(int i=3;i<=Math.sqrt(num);i+=2) {
                while(num%i==0) {
                    arr[k++]=i;
                    num/=i;
                }
            }
            	if(num>2) {
                arr[arr.length-1]=num;        
                }
            
            for(int j=0;j<arr.length;j++) {
                if(!(arr[j]==2 || arr[j]==3 || arr[j]==5 || arr[j]==0)) {
                flag = false;
                break;
                }     
            }
        }
        return flag;
		
		
		
		int[] arr = {1,2,3,3};
		int[] temp= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[arr[i]-1]=temp[arr[i]-1]+1;
		}
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>1)
				System.out.println("duplicate "+(i+1));
			if(temp[i]==0)
				System.out.println("missing "+(i+1));
		}
		
		
		String num1="123",num2="456";
	    int[] pos = new int[num1.length() + num2.length()];

        // Calculate the result of each index in the pos array.
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int p1 = i + j, p2 = i + j + 1;
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
          
                int sum = mul + pos[p2];
                
                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }
        
        String s="";
        for(int p : pos) {
        	if(s.length()!=0 || p!=0)
        	s=s.concat(String.valueOf(p));
        }
        
        System.out.println(s);
		
		
		
		String str="423";
		int num=0;
		int i=0;
		while(i<str.length()) {
			
			num*=10;
			num+=str.charAt(i++)-'0';
			
		}
		System.out.println(num);
		
		
		
		//arrange similar col0or together

		int[] arr = {2,1,0,1,0,2};
		int zero_index =0;
		int two_index=arr.length-1;
		int i=0;
		
		while(i<=two_index) {
			if(arr[i]==0) {
				swap_data(arr, zero_index++, i++);
			}
			if(arr[i]==2) {
				swap_data(arr, two_index--, i);
			}
			else
				i++;
		}
		
		System.out.println(Arrays.toString(arr));

		

		int[] nums = {99,99};
		int k=2;
		
		 boolean flag = false;
	        Map<Integer, Integer> map = new HashMap<>();

	        for(int i=0;i<nums.length;i++) {
	                if(map.containsKey(nums[i]) && Math.abs(i-map.get(nums[i]))<=k)
	                    flag = true;
	                map.put(nums[i], i);
	        }
	        System.out.println(flag);
		
		
		
		String[] magazine = {"ive", "got", "a", "lovely", "bunch", "of", "coconuts"};
		String[] note = {"ive", "got", "some", "coconuts"};
		 String res = "Yes";
	        Set<String> set = new HashSet<>();
	        for(int i=0;i<magazine.length;i++) {
	            set.add(magazine[i]);
	        }
	        Map<String, Integer> map = new HashMap<>();
	          for(int j=0;j<note.length;j++) {
	            if(set.contains(note[j])) {
	            	if(map.get(note[j])!=null) {
	                    map.put(note[j],map.get(note[j])+1);
	                } else {
	                     map.put(note[j],1);
	                }
	            }
	           
	        }
	        System.out.println(res);
		
		
				
		List<Long> list = Arrays.asList(2L,34L,22L,17L);
		list.sort(Comparator.naturalOrder());
		
		long ll = (list.get(3-1)-list.get(0))+1;
		System.out.println(ll);
		
		
		String str = "abcdabc";
		String temp ="";
		for(int i=0;i<str.length();i++) {
			Set<Character> set = new HashSet<>();
			int end =0;
			for(int j=i;j<str.length();j++) {
				char ch = str.charAt(j);
				if(set.contains(ch)) {
					end=j;
					break;
				} else {
					set.add(ch);
				}
			}
			
			if(temp.length()<end-i) {
				temp = str.substring(i,end);
			}
		}
		System.out.println(temp);
		
		

		String photo = "moviestars.jpg";

		AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.defaultClient();

	      GetCelebrityInfoRequest request = new GetCelebrityInfoRequest()
	         .withId(photo);

	      System.out.println("Getting information for celebrity: " + id);

	      GetCelebrityInfoResult result=rekognitionClient.getCelebrityInfo(request);

	      //Display celebrity information
	      System.out.println("celebrity name: " + result.getName());
	      System.out.println("Further information (if available):");
	      for (String url: result.getUrls()){
	         System.out.println(url);
	      }
	*/}
	
	static void swap_data(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
