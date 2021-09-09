package converter.units.length

class KilometerUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.KILOMETER
    override val abbreviated: String
        get() = "km"
    override val oneUnit: String
        get() = "kilometer"
    override val manyUnits: String
        get() = "kilometers"
    override val toMeters: Double
        get() = length.times(1000.0)
}