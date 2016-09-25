package de.henny022.RiskOnline.Territories;

import java.util.Arrays;

/**
 * Created by henny on 24.09.16.
 */
public class Territories
{
    //North America
    public static Territory ALASKA = new Territory(TerritoryEnum.ALASKA, "Alaska",
            Arrays.asList(TerritoryEnum.KAMCHATKA, TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.ALBERTA));

    public static Territory NORTH_WEST_TERRITORY = new Territory(TerritoryEnum.NORTH_WEST_TERRITORY, "North West Terriytory",
            Arrays.asList(TerritoryEnum.ALASKA, TerritoryEnum.ALBERTA, TerritoryEnum.ONTARIO, TerritoryEnum.GREENLAND));

    public static Territory ALBERTA = new Territory(TerritoryEnum.ALBERTA, "Alberta",
            Arrays.asList(TerritoryEnum.ALASKA, TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.ONTARIO, TerritoryEnum.WESTERN_UNITED_STATES));

    public static Territory ONTARIO = new Territory(TerritoryEnum.ONTARIO, "Ontario",
            Arrays.asList(TerritoryEnum.ALBERTA, TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.QUEBEC, TerritoryEnum.WESTERN_UNITED_STATES, TerritoryEnum.EASTERN_UNITED_STATES, TerritoryEnum.GREENLAND));

    public static Territory GREENLAND = new Territory(TerritoryEnum.GREENLAND, "Greenland",
            Arrays.asList(TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.ONTARIO, TerritoryEnum.QUEBEC, TerritoryEnum.ICELAND));

    public static Territory QUEBEC = new Territory(TerritoryEnum.QUEBEC, "Quebec",
            Arrays.asList(TerritoryEnum.GREENLAND, TerritoryEnum.ONTARIO, TerritoryEnum.EASTERN_UNITED_STATES));

    public static Territory WESTERN_UNITED_STATES = new Territory(TerritoryEnum.WESTERN_UNITED_STATES, "Western United States",
            Arrays.asList(TerritoryEnum.EASTERN_UNITED_STATES, TerritoryEnum.ALBERTA, TerritoryEnum.ONTARIO, TerritoryEnum.CENTRAL_AMERICA));

    public static Territory EASTERN_UNITED_STATES = new Territory(TerritoryEnum.EASTERN_UNITED_STATES, "Eastern United States",
            Arrays.asList(TerritoryEnum.WESTERN_UNITED_STATES, TerritoryEnum.CENTRAL_AMERICA, TerritoryEnum.QUEBEC, TerritoryEnum.ONTARIO));

    public static Territory CENTRAL_AMERICA = new Territory(TerritoryEnum.CENTRAL_AMERICA, "Central America",
            Arrays.asList(TerritoryEnum.EASTERN_UNITED_STATES, TerritoryEnum.WESTERN_UNITED_STATES, TerritoryEnum.VENEZUELA));

    //South America
    public static Territory VENEZUELA = new Territory(TerritoryEnum.VENEZUELA, "Venezuela",
            Arrays.asList(TerritoryEnum.CENTRAL_AMERICA, TerritoryEnum.PERU, TerritoryEnum.BRAZIL));

    public static Territory PERU = new Territory(TerritoryEnum.PERU, "Peru",
            Arrays.asList(TerritoryEnum.VENEZUELA, TerritoryEnum.BRAZIL, TerritoryEnum.ARGENTINA));

    public static Territory ARGENTINA = new Territory(TerritoryEnum.ARGENTINA, "Argentina",
            Arrays.asList(TerritoryEnum.PERU, TerritoryEnum.BRAZIL));

    public static Territory BRAZIL = new Territory(TerritoryEnum.BRAZIL, "Brazil",
            Arrays.asList(TerritoryEnum.VENEZUELA, TerritoryEnum.PERU, TerritoryEnum.ARGENTINA, TerritoryEnum.NORTH_AFRIKA));
}
