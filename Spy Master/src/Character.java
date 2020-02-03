
public class Character
	{
		String codeName;
		String name;
		Integer age;
		String nationality;
		String specialty;
		String knowBeforeYouGo;
		
		public Character (String c, String n, Integer a, String nat, String s, String k)
		{
			codeName = c;
			name = n;
			age = a;
			nationality = nat;
			specialty = s;
			knowBeforeYouGo = k;
		}

		public String getCodeName()
			{
				return codeName;
			}

		public void setCodeName(String codeName)
			{
				this.codeName = codeName;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public Integer getAge()
			{
				return age;
			}

		public void setAge(Integer age)
			{
				this.age = age;
			}

		public String getNationality()
			{
				return nationality;
			}

		public void setNationality(String nationality)
			{
				this.nationality = nationality;
			}

		public String getSpecialty()
			{
				return specialty;
			}

		public void setSpecialty(String specialty)
			{
				this.specialty = specialty;
			}

		public String getKnowBeforeYouGo()
			{
				return knowBeforeYouGo;
			}

		public void setKnowBeforeYouGo(String knowBeforeYouGo)
			{
				this.knowBeforeYouGo = knowBeforeYouGo;
			}
		
		
	}
