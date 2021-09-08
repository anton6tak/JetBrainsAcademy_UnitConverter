package converter.units.length

class CentimeterUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.CENTIMETER
    override val abbreviated: String
        get() = "cm"
    override val oneUnit: String
        get() = "centimeter"
    override val manyUnits: String
        get() = "centimeters"
    override val toMeters: Double
        get() = length.times(0.01)
}