class User
{
	String name;
	int table;
	String ide;
	int entertime;
	int exittime;
	String status;
	long extra;
User()
{
}
User(String name)
{
String nm;
nm=name;
}

User(String name, String id) {
	this.name = name;
	this.ide = id;
}

public String getName() {
	return this.name;
}


}
