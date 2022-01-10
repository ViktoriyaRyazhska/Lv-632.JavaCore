package lesson004c;

public class Task03 {

	public enum Continent {
		AFRICA, ANTARCTICA, ASIA, AUSTRALIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, NON
	}

	public enum Country {
		Nigeria(Continent.AFRICA), Ethiopia(Continent.AFRICA), Egypt(Continent.AFRICA), Tanzania(Continent.AFRICA),
		South_Africa(Continent.AFRICA), Morocco(Continent.AFRICA), Cameroon(Continent.AFRICA),
		Botswana(Continent.AFRICA), Liberia(Continent.AFRICA), Sudan(Continent.AFRICA), China(Continent.ASIA),
		India(Continent.ASIA), Indonesia(Continent.ASIA), Pakistan(Continent.ASIA), Japan(Continent.ASIA),
		Turkey(Continent.ASIA), Thailand(Continent.ASIA), Afghanistan(Continent.ASIA), Syria(Continent.ASIA),
		Israela(Continent.ASIA), USA(Continent.NORTH_AMERICA), Mexico(Continent.NORTH_AMERICA),
		Canada(Continent.NORTH_AMERICA), Costa_Rica(Continent.NORTH_AMERICA), Cuba(Continent.NORTH_AMERICA),
		Dominican_Republic(Continent.NORTH_AMERICA), Guatemala(Continent.NORTH_AMERICA),
		Honduras(Continent.NORTH_AMERICA), Nicaragua(Continent.NORTH_AMERICA), Panama(Continent.NORTH_AMERICA),
		Brazil(Continent.SOUTH_AMERICA), Colombia(Continent.SOUTH_AMERICA), Peru(Continent.SOUTH_AMERICA),
		Venezuela(Continent.SOUTH_AMERICA), Chile(Continent.SOUTH_AMERICA), Ecuador(Continent.SOUTH_AMERICA),
		Bolivia(Continent.SOUTH_AMERICA), Paraguay(Continent.SOUTH_AMERICA), Uruguay(Continent.SOUTH_AMERICA),
		Guyana(Continent.SOUTH_AMERICA), Germany(Continent.EUROPE), France(Continent.EUROPE),
		Netherlands(Continent.EUROPE), Belgium(Continent.EUROPE), Austria(Continent.EUROPE), Russia(Continent.EUROPE),
		Ukraine(Continent.EUROPE), Poland(Continent.EUROPE), Romania(Continent.EUROPE), Hungary(Continent.EUROPE),
		Slovakia(Continent.EUROPE), Belarus(Continent.EUROPE), Moldova(Continent.EUROPE), Sweden(Continent.EUROPE),
		Denmark(Continent.EUROPE), Finland(Continent.EUROPE), Italy(Continent.EUROPE), Spain(Continent.EUROPE),
		Greece(Continent.EUROPE), Serbia(Continent.EUROPE), Slovenia(Continent.EUROPE);

		Continent continent;

		Country(Continent continent) {
			this.continent = continent;
		}

		public Continent getContinent() {
			return continent;
		}
	}
}