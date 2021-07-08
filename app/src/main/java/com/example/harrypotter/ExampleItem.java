package com.example.harrypotter;


import android.os.Parcel;
import android.os.Parcelable;

public class ExampleItem implements Parcelable {

    String name;
    String species;
    String gender;
    String house;
    String dateOfBirth;
    String yearOfBirth;
    String ancestry;
    String eyeColour;
    String hairColour;

    String wood;
    String core;
    String length;

    String patronus;
    String hogwartsStudent;
    String hogwartsStaff;
    String actor;
    String alive;
    String img;

    public ExampleItem(String name, String species, String gender, String house, String dateOfBirth,
                       String yearOfBirth, String ancestry, String eyeColour, String hairColour,
                       String wood, String core, String length, String patronus, String hogwartsStudent,
                       String hogwartsStaff, String actor, String alive, String img) {
        this.name = name;
        this.species = species;
        this.gender = gender;
        this.house = house;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.ancestry = ancestry;
        this.eyeColour = eyeColour;
        this.hairColour = hairColour;
        this.wood = wood;
        this.core = core;
        this.length = length;
        this.patronus = patronus;
        this.hogwartsStudent = hogwartsStudent;
        this.hogwartsStaff = hogwartsStaff;
        this.actor = actor;
        this.alive = alive;
        this.img = img;
    }

    public ExampleItem() {

    }

    protected ExampleItem(Parcel in) {
        name = in.readString();
        species = in.readString();
        gender = in.readString();
        house = in.readString();
        dateOfBirth = in.readString();
        yearOfBirth = in.readString();
        ancestry = in.readString();
        eyeColour = in.readString();
        hairColour = in.readString();
        wood = in.readString();
        core = in.readString();
        length = in.readString();
        patronus = in.readString();
        hogwartsStudent = in.readString();
        hogwartsStaff = in.readString();
        actor = in.readString();
        alive = in.readString();
        img = in.readString();
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getGender() {
        return gender;
    }

    public String getHouse() {
        return house;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getAncestry() {
        return ancestry;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getWood() {
        return wood;
    }

    public String getCore() {
        return core;
    }

    public String getLength() {
        return length;
    }

    public String getPatronus() {
        return patronus;
    }

    public String getHogwartsStudent() {
        return hogwartsStudent;
    }

    public String getHogwartsStaff() {
        return hogwartsStaff;
    }

    public String getActor() {
        return actor;
    }

    public String getAlive() {
        return alive;
    }

    public String getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public void setHogwartsStudent(String hogwartsStudent) {
        this.hogwartsStudent = hogwartsStudent;
    }

    public void setHogwartsStaff(String hogwartsStaff) {
        this.hogwartsStaff = hogwartsStaff;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public void setAlive(String alive) {
        this.alive = alive;
    }

    public void setImg(String img) {
        this.img = img;
    }



    public static final Parcelable.Creator<ExampleItem> CREATOR = new Creator<ExampleItem>() {
        @Override
        public ExampleItem createFromParcel(Parcel in) {
            return new ExampleItem(in);
        }

        @Override
        public ExampleItem[] newArray(int size) {
            return new ExampleItem[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(species);
        dest.writeString(gender);
        dest.writeString(house);
        dest.writeString(dateOfBirth);
        dest.writeString(yearOfBirth);
        dest.writeString(ancestry);
        dest.writeString(eyeColour);
        dest.writeString(hairColour);
        dest.writeString(wood);
        dest.writeString(core);
        dest.writeString(length);
        dest.writeString(patronus);
        dest.writeString(hogwartsStudent);
        dest.writeString(hogwartsStaff);
        dest.writeString(actor);
        dest.writeString(alive);
        dest.writeString(img);
    }
}