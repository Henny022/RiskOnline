package de.henny022.RiskOnline.Game.World;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by henny on 14.10.16.
 */
public class World implements Serializable
{
    private static World instance = new World();
    private Map<EContinent, Continent> continents = new HashMap<>();
    private Map<ETerritory, Territory> territories = new HashMap<>();

    protected World()
    {
        addContinents();
        addTerritories();
    }

    private void addContinents()
    {
        continents.put(EContinent.NORTH_AMERICA, new Continent(EContinent.NORTH_AMERICA, "North America", 5));
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.ALASKA);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.NORTH_WEST_TERRITORY);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.GREENLAND);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.ALBERTA);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.ONTARIO);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.QUEBEC);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.WESTERN_UNITED_STATES);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.EASTERN_UNITED_STATES);
        continents.get(EContinent.NORTH_AMERICA).addTerritory(ETerritory.CENTRAL_AMERICA);

        continents.put(EContinent.SOUTH_AMERICA, new Continent(EContinent.SOUTH_AMERICA, "South America", 2));
        continents.get(EContinent.SOUTH_AMERICA).addTerritory(ETerritory.VENEZUELA);
        continents.get(EContinent.SOUTH_AMERICA).addTerritory(ETerritory.PERU);
        continents.get(EContinent.SOUTH_AMERICA).addTerritory(ETerritory.ARGENTINA);
        continents.get(EContinent.SOUTH_AMERICA).addTerritory(ETerritory.BRAZIL);

        continents.put(EContinent.EUROPE, new Continent(EContinent.EUROPE, "Europe", 5));
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.ICELAND);
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.GREAT_BRITAIN);
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.SCANDINAVIA);
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.UKRAINE);
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.NORTHERN_EUROPE);
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.WESTERN_EUROPE);
        continents.get(EContinent.EUROPE).addTerritory(ETerritory.SOUTHERN_EUROPE);

        continents.put(EContinent.AFRICA, new Continent(EContinent.AFRICA, "Africa", 3));
        continents.get(EContinent.AFRICA).addTerritory(ETerritory.NORTH_AFRICA);
        continents.get(EContinent.AFRICA).addTerritory(ETerritory.EGYPT);
        continents.get(EContinent.AFRICA).addTerritory(ETerritory.EAST_AFRICA);
        continents.get(EContinent.AFRICA).addTerritory(ETerritory.MADAGASCAR);
        continents.get(EContinent.AFRICA).addTerritory(ETerritory.SOUTH_AFRICA);
        continents.get(EContinent.AFRICA).addTerritory(ETerritory.CONGO);

        continents.put(EContinent.ASIA, new Continent(EContinent.ASIA, "Asia", 7));
        continents.get(EContinent.ASIA).addTerritory(ETerritory.URAL);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.SIBERIA);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.KAMCHATKA);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.JAPAN);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.MONGOLIA);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.CHINA);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.IRKUTSK);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.YAKUTSK);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.MIDDLE_EAST);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.INDIA);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.SIAM);
        continents.get(EContinent.ASIA).addTerritory(ETerritory.AFGHANISTAN);

        continents.put(EContinent.AUSTRALIA, new Continent(EContinent.AUSTRALIA, "Australia", 2));
        continents.get(EContinent.AUSTRALIA).addTerritory(ETerritory.INDONESIA);
        continents.get(EContinent.AUSTRALIA).addTerritory(ETerritory.NEW_GUINEA);
        continents.get(EContinent.AUSTRALIA).addTerritory(ETerritory.WESTERN_AUSTRALIA);
        continents.get(EContinent.AUSTRALIA).addTerritory(ETerritory.EASTERN_AUSTRALIA);
    }

    private void addTerritories()
    {
        territories.put(ETerritory.NORTH_WEST_TERRITORY, new Territory(ETerritory.NORTH_WEST_TERRITORY, "North West Territory"));
        territories.get(ETerritory.NORTH_WEST_TERRITORY).addNeighbour(ETerritory.ALASKA);
        territories.get(ETerritory.NORTH_WEST_TERRITORY).addNeighbour(ETerritory.ALBERTA);
        territories.get(ETerritory.NORTH_WEST_TERRITORY).addNeighbour(ETerritory.ONTARIO);
        territories.get(ETerritory.NORTH_WEST_TERRITORY).addNeighbour(ETerritory.GREENLAND);

        territories.put(ETerritory.ALASKA, new Territory(ETerritory.ALASKA, "Alaska"));
        territories.get(ETerritory.ALASKA).addNeighbour(ETerritory.NORTH_WEST_TERRITORY);
        territories.get(ETerritory.ALASKA).addNeighbour(ETerritory.KAMCHATKA);
        territories.get(ETerritory.ALASKA).addNeighbour(ETerritory.ALBERTA);

        territories.put(ETerritory.GREENLAND, new Territory(ETerritory.GREENLAND, "Greenland"));
        territories.get(ETerritory.GREENLAND).addNeighbour(ETerritory.NORTH_WEST_TERRITORY);
        territories.get(ETerritory.GREENLAND).addNeighbour(ETerritory.ONTARIO);
        territories.get(ETerritory.GREENLAND).addNeighbour(ETerritory.QUEBEC);
        territories.get(ETerritory.GREENLAND).addNeighbour(ETerritory.ICELAND);

        territories.put(ETerritory.ALBERTA, new Territory(ETerritory.ALBERTA, "Alberta"));
        territories.get(ETerritory.ALBERTA).addNeighbour(ETerritory.ALASKA);
        territories.get(ETerritory.ALBERTA).addNeighbour(ETerritory.NORTH_WEST_TERRITORY);
        territories.get(ETerritory.ALBERTA).addNeighbour(ETerritory.ONTARIO);
        territories.get(ETerritory.ALBERTA).addNeighbour(ETerritory.WESTERN_UNITED_STATES);

        territories.put(ETerritory.ONTARIO, new Territory(ETerritory.ONTARIO, "Ontario"));
        territories.get(ETerritory.ONTARIO).addNeighbour(ETerritory.ALBERTA);
        territories.get(ETerritory.ONTARIO).addNeighbour(ETerritory.NORTH_WEST_TERRITORY);
        territories.get(ETerritory.ONTARIO).addNeighbour(ETerritory.GREENLAND);
        territories.get(ETerritory.ONTARIO).addNeighbour(ETerritory.QUEBEC);
        territories.get(ETerritory.ONTARIO).addNeighbour(ETerritory.WESTERN_UNITED_STATES);
        territories.get(ETerritory.ONTARIO).addNeighbour(ETerritory.EASTERN_UNITED_STATES);

        territories.put(ETerritory.QUEBEC, new Territory(ETerritory.QUEBEC, "Quebec"));
        territories.get(ETerritory.QUEBEC).addNeighbour(ETerritory.ONTARIO);
        territories.get(ETerritory.QUEBEC).addNeighbour(ETerritory.GREENLAND);
        territories.get(ETerritory.QUEBEC).addNeighbour(ETerritory.EASTERN_UNITED_STATES);
    }

    public static World getInstance()
    {
        return instance;
    }

    /**
     * Used to convert a EContinent to a Continent
     *
     * @param eContinent
     * @return the Continent Object matching the Enum
     */
    public Continent getContinentByEnum(EContinent eContinent)
    {
        return continents.get(eContinent);
    }

    /**
     * Used to convert a ETerritory to a Territory
     *
     * @param eTerritory
     * @return the Territory Object matching the Enum
     */
    public Continent getTerritoryByEnum(ETerritory eTerritory)
    {
        return continents.get(eTerritory);
    }

    public Map<EContinent, Continent> getContinents()
    {
        return continents;
    }

    public Map<ETerritory, Territory> getTerritories()
    {
        return territories;
    }

    /**
     * For loading a saved game
     *
     * @param instance
     */
    public static void setInstance(World instance)
    {
        World.instance = instance;
    }
}
