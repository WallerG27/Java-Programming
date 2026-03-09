package test;

//Write your code here
//This a comment.
public class JobApplicant
{
private String name;
private String phone;
private boolean hasWordSkill;
private boolean hasSpreadsheetSkill;
private boolean hasDatabaseSkill;
private boolean hasGraphicsSkill;
public JobApplicant()
{
   this.name = "";
   this.phone = "";
   hasWordSkill = false;
   hasSpreadsheetSkill = false;
   hasDatabaseSkill = false; 
   hasGraphicsSkill = false;
} 

public void setName(String name)
{
      this.name = name;
}
public void setPhone(String phone)
{
   this.phone = phone;
}
public void setWordSkill(Boolean ws)
{
   this.hasWordSkill = ws;
}
public void setSpreadsheetSkill(Boolean ss)
{
   this.hasSpreadsheetSkill = ss;
}
public void setDatabaseSkill(Boolean db)
{
	this.hasDatabaseSkill = db;
}
public void setGraphicsSkill(Boolean gs)
{
	this.hasGraphicsSkill = gs;
}

public String getName()
{
   return name;
}
public String getPhone()
{
   return phone;
}
public boolean getHasWordSkill()
{
   return hasWordSkill;
}
public boolean getHasSpreadsheetSkill()
{
   return hasSpreadsheetSkill;
}
public boolean getHasDatabaseSkill()
{
   return hasDatabaseSkill;
}
public boolean getHasGraphicsSkill()
{
   return hasGraphicsSkill;
}
}