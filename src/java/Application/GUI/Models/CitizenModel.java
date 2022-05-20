package Application.GUI.Models;

import Application.BE.Category;
import Application.BE.Citizen;
import Application.BE.ContentEntry;
import Application.BE.GeneralJournal;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CitizenModel implements Cloneable{

    private StringProperty firstName;
    private StringProperty lastName;
    private IntegerProperty age;


    private StringProperty coping;
    private StringProperty motivation;
    private StringProperty resources;
    private StringProperty roles;
    private StringProperty habits;
    private StringProperty eduAndJob;
    private StringProperty lifeStory;
    private StringProperty healthInfo;
    private StringProperty assistiveDevices;
    private StringProperty homeLayout;
    private StringProperty network;

    private Citizen beCitizen;

    private ObservableList<CategoryEntryModel> relevantFunctionalAbilities;
    private ObservableList<CategoryEntryModel> relevantHealthConditions;
    private ObservableList<CategoryEntryModel> nonRelevantFunctionalAbilities;
    private ObservableList<CategoryEntryModel> nonRelevantHealthConditions;


    public CitizenModel(String firstName, String lastName, int age) {
        this.beCitizen = new Citizen(-1, new GeneralJournal(), SessionModel.getSchool(), firstName, lastName, age);

        this.firstName = new SimpleStringProperty(beCitizen.getFirstname());
        this.lastName = new SimpleStringProperty(beCitizen.getLastname());
        this.age = new SimpleIntegerProperty(beCitizen.getAge());

        this.coping = new SimpleStringProperty(beCitizen.getGeneralInfo().getCoping());
        this.motivation = new SimpleStringProperty(beCitizen.getGeneralInfo().getMotivation());
        this.resources = new SimpleStringProperty(beCitizen.getGeneralInfo().getResources());
        this.roles = new SimpleStringProperty(beCitizen.getGeneralInfo().getRoles());
        this.habits = new SimpleStringProperty(beCitizen.getGeneralInfo().getHabits());
        this.eduAndJob = new SimpleStringProperty(beCitizen.getGeneralInfo().getEduAndJob());
        this.lifeStory = new SimpleStringProperty(beCitizen.getGeneralInfo().getLifeStory());
        this.healthInfo = new SimpleStringProperty(beCitizen.getGeneralInfo().getHealthInfo());
        this.assistiveDevices = new SimpleStringProperty(beCitizen.getGeneralInfo().getAssistiveDevices());
        this.homeLayout = new SimpleStringProperty(beCitizen.getGeneralInfo().getHomeLayout());
        this.network = new SimpleStringProperty(beCitizen.getGeneralInfo().getNetwork());
        initBindings();

        this.relevantFunctionalAbilities = FXCollections.observableArrayList();
        this.relevantHealthConditions = FXCollections.observableArrayList();
        this.nonRelevantFunctionalAbilities = FXCollections.observableArrayList();
        this.nonRelevantHealthConditions = FXCollections.observableArrayList();

        initFunctionalAbilities();
        initHealthConditions();
    }

    public CitizenModel(Citizen citizen) {
        this.beCitizen = citizen;

        this.firstName = new SimpleStringProperty(beCitizen.getFirstname());
        this.lastName = new SimpleStringProperty(beCitizen.getLastname());
        this.age = new SimpleIntegerProperty(beCitizen.getAge());

        this.coping = new SimpleStringProperty(beCitizen.getGeneralInfo().getCoping());
        this.motivation = new SimpleStringProperty(beCitizen.getGeneralInfo().getMotivation());
        this.resources = new SimpleStringProperty(beCitizen.getGeneralInfo().getResources());
        this.roles = new SimpleStringProperty(beCitizen.getGeneralInfo().getRoles());
        this.habits = new SimpleStringProperty(beCitizen.getGeneralInfo().getHabits());
        this.eduAndJob = new SimpleStringProperty(beCitizen.getGeneralInfo().getEduAndJob());
        this.lifeStory = new SimpleStringProperty(beCitizen.getGeneralInfo().getLifeStory());
        this.healthInfo = new SimpleStringProperty(beCitizen.getGeneralInfo().getHealthInfo());
        this.assistiveDevices = new SimpleStringProperty(beCitizen.getGeneralInfo().getAssistiveDevices());
        this.homeLayout = new SimpleStringProperty(beCitizen.getGeneralInfo().getHomeLayout());
        this.network = new SimpleStringProperty(beCitizen.getGeneralInfo().getNetwork());
        initBindings();


        this.relevantFunctionalAbilities = FXCollections.observableArrayList();
        this.relevantHealthConditions = FXCollections.observableArrayList();
        this.nonRelevantFunctionalAbilities = FXCollections.observableArrayList();
        this.nonRelevantHealthConditions = FXCollections.observableArrayList();

        initFunctionalAbilities();
        initHealthConditions();
    }

    public CitizenModel() {
        this.firstName = new SimpleStringProperty();
        this.lastName = new SimpleStringProperty();
        this.age = new SimpleIntegerProperty();
        this.coping = new SimpleStringProperty(beCitizen.getGeneralInfo().getCoping());
        this.motivation = new SimpleStringProperty(beCitizen.getGeneralInfo().getMotivation());
        this.resources = new SimpleStringProperty(beCitizen.getGeneralInfo().getResources());
        this.roles = new SimpleStringProperty(beCitizen.getGeneralInfo().getRoles());
        this.habits = new SimpleStringProperty(beCitizen.getGeneralInfo().getHabits());
        this.eduAndJob = new SimpleStringProperty(beCitizen.getGeneralInfo().getEduAndJob());
        this.lifeStory = new SimpleStringProperty(beCitizen.getGeneralInfo().getLifeStory());
        this.healthInfo = new SimpleStringProperty(beCitizen.getGeneralInfo().getHealthInfo());
        this.assistiveDevices = new SimpleStringProperty(beCitizen.getGeneralInfo().getAssistiveDevices());
        this.homeLayout = new SimpleStringProperty(beCitizen.getGeneralInfo().getHomeLayout());
        this.network = new SimpleStringProperty(beCitizen.getGeneralInfo().getNetwork());



        this.relevantFunctionalAbilities = FXCollections.observableArrayList();
        this.relevantHealthConditions = FXCollections.observableArrayList();
        this.nonRelevantFunctionalAbilities = FXCollections.observableArrayList();
        this.nonRelevantHealthConditions = FXCollections.observableArrayList();

        initFunctionalAbilities();
        initHealthConditions();
    }


    private void initBindings() {
        this.firstName.bindBidirectional(new SimpleStringProperty(beCitizen.getFirstname()));
        this.lastName.bindBidirectional(new SimpleStringProperty(beCitizen.getLastname()));
        this.age.bindBidirectional(new SimpleIntegerProperty(beCitizen.getAge()));

        this.coping.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getCoping()));
        this.motivation.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getMotivation()));
        this.resources.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getResources()));
        this.roles.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getRoles()));
        this.habits.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getHabits()));
        this.eduAndJob.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getEduAndJob()));
        this.lifeStory.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getLifeStory()));
        this.healthInfo.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getHealthInfo()));
        this.assistiveDevices.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getAssistiveDevices()));
        this.homeLayout.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getHomeLayout()));
        this.network.bindBidirectional(new SimpleStringProperty(beCitizen.getGeneralInfo().getNetwork()));
    }

    @Override
    public String toString() {
        return firstName.get() + " " + lastName.get();
    }

    private void initFunctionalAbilities() {
        relevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Walking"), 1)));
        relevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Climbing"), 1)));
        relevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Swimming"), 1)));
        relevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Bathing"), 4)));

        nonRelevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Sleeping"), 0)));
        nonRelevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Eating"), 0)));
        nonRelevantFunctionalAbilities.add(new CategoryEntryModel(new ContentEntry(0, new Category("Toileting"), 0)));
    }

    private void initHealthConditions() {
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("Diabetes"), 1)));
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("High Blood Pressure"), 1)));
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("Heart Disease"), 1)));
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("Asthma"), 1)));
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("Epilepsy"), 1)));
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("Allergies"), 1)));
        relevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("Other"), 1)));

        nonRelevantHealthConditions.add(new CategoryEntryModel(new ContentEntry(0, new Category("None"), 0)));

    }


    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName.set(name);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }


    public String getCoping() {
        return coping.get();
    }

    public void setCoping(String coping) {
        this.coping.set(coping);
    }

    public String getMotivation() {
        return motivation.get();
    }

    public void setMotivation(String motivation) {
        this.motivation.set(motivation);
    }

    public StringProperty copingProperty() {
        return coping;
    }

    public StringProperty motivationProperty() {
        return motivation;
    }

    public String getResources() {
        return resources.get();
    }

    public StringProperty resourcesProperty() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources.set(resources);
    }

    public String getRoles() {
        return roles.get();
    }

    public StringProperty rolesProperty() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles.set(roles);
    }

    public String getHabits() {
        return habits.get();
    }

    public StringProperty habitsProperty() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits.set(habits);
    }

    public String getEduAndJob() {
        return eduAndJob.get();
    }

    public StringProperty eduAndJobProperty() {
        return eduAndJob;
    }

    public void setEduAndJob(String eduAndJob) {
        this.eduAndJob.set(eduAndJob);
    }

    public String getLifeStory() {
        return lifeStory.get();
    }

    public StringProperty lifeStoryProperty() {
        return lifeStory;
    }

    public void setLifeStory(String lifeStory) {
        this.lifeStory.set(lifeStory);
    }

    public String getHealthInfo() {
        return healthInfo.get();
    }

    public StringProperty healthInfoProperty() {
        return healthInfo;
    }

    public void setHealthInfo(String healthInfo) {
        this.healthInfo.set(healthInfo);
    }

    public String getAssistiveDevices() {
        return assistiveDevices.get();
    }

    public StringProperty assistiveDevicesProperty() {
        return assistiveDevices;
    }

    public void setAssistiveDevices(String assistiveDevices) {
        this.assistiveDevices.set(assistiveDevices);
    }

    public String getHomeLayout() {
        return homeLayout.get();
    }

    public StringProperty homeLayoutProperty() {
        return homeLayout;
    }

    public void setHomeLayout(String homeLayout) {
        this.homeLayout.set(homeLayout);
    }

    public String getNetwork() {
        return network.get();
    }

    public StringProperty networkProperty() {
        return network;
    }

    public void setNetwork(String network) {
        this.network.set(network);
    }

    public Citizen getBeCitizen() {
        return beCitizen;
    }

    public void setBeCitizen(Citizen beCitizen) {
        this.beCitizen = beCitizen;
    }

    public ObservableList<CategoryEntryModel> getNonRelevantFunctionalAbilities() {
        return nonRelevantFunctionalAbilities;
    }

    public void setNonRelevantFunctionalAbilities(ObservableList<CategoryEntryModel> nonRelevantFunctionalAbilities) {
        this.nonRelevantFunctionalAbilities = relevantFunctionalAbilities;
    }

    public ObservableList<CategoryEntryModel> getNonRelevantHealthConditions() {
        return nonRelevantHealthConditions;
    }

    public void setNonRelevantHealthConditions(ObservableList<CategoryEntryModel> nonRelevantHealthConditions) {
        this.nonRelevantHealthConditions = relevantHealthConditions;
    }
    public ObservableList<CategoryEntryModel> getRelevantFunctionalAbilities() {
        return relevantFunctionalAbilities;
    }

    public void setRelevantFunctionalAbilities(ObservableList<CategoryEntryModel> relevantFunctionalAbilities) {
        this.relevantFunctionalAbilities = relevantFunctionalAbilities;
    }

    public ObservableList<CategoryEntryModel> getRelevantHealthConditions() {
        return relevantHealthConditions;
    }

    public void setRelevantHealthConditions(ObservableList<CategoryEntryModel> relevantHealthConditions) {
        this.relevantHealthConditions = relevantHealthConditions;
    }

    public ObservableList<CategoryEntryModel> getAllFuncCategories() {
        ObservableList<CategoryEntryModel> allFuncConditions = FXCollections.observableArrayList();
        allFuncConditions.addAll(nonRelevantFunctionalAbilities);
        allFuncConditions.addAll(relevantFunctionalAbilities);
        return allFuncConditions;
    }

    public ObservableList<CategoryEntryModel> getAllHealthConditions() {
        ObservableList<CategoryEntryModel> allHealthConditions = FXCollections.observableArrayList();
        allHealthConditions.addAll(nonRelevantHealthConditions);
        allHealthConditions.addAll(relevantHealthConditions);
        return allHealthConditions;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
