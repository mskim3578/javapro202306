package ch12_API;
/*String : (jdk 제공객체)은 equals(), hashCode() 를 오버라이딩 함
 */
class HashCodeEx1 {
	public static void main(String[] args) {
		Value v1 = new Value("abc");
		Value v2 = new Value("abc");
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		}}
class Value {
	String value;
	Value(String value) {
		this.value=value;
	}
	
	@Override
		public boolean equals(Object obj) {
		if (obj instanceof  Value) {
			Value e = (Value) obj;
			return (value.equals(e.value));
		}
		return false;
		}	
	
		public int hashCode() {
			return value.hashCode();
			
		}

}