package converter.units.length

class MileUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.MILE
    override val abbreviated: String
        get() = "mi"
    override val oneUnit: String
        get() = "mile"
    override val manyUnits: String
        get() = "miles"
    override val toMeters: Double
        get() = length.times(1609.35)
}