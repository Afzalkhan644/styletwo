package com.thinking.machines.hr.beans;
public class MessageBean implements java.io.Serializable{
    private String message;
    private String header;
    private Boolean generateButtons;
    private Boolean generateTwoButtons;
    private String buttonOneText;
    private String buttonTwoText;
    private String buttonOneAction;
    private String buttonTwoAction;

    public MessageBean() {

    this.message="";
this.header="";
this.generateButtons=false;
this.generateTwoButtons=false;
this.buttonOneText="";
this.buttonTwoText="";
this.buttonOneAction="";
this.buttonTwoAction="";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Boolean getGenerateButtons() {
        return generateButtons;
    }

    public void setGenerateButtons(Boolean generateButtons) {
        this.generateButtons = generateButtons;
    }

    public Boolean getGenerateTwoButtons() {
        return generateTwoButtons;
    }

    public void setGenerateTwoButtons(Boolean generateTwoButtons) {
        this.generateTwoButtons = generateTwoButtons;
    }

    public String getButtonOneText() {
        return buttonOneText;
    }

    public void setButtonOneText(String buttonOneText) {
        this.buttonOneText = buttonOneText;
    }

    public String getButtonTwoText() {
        return buttonTwoText;
    }

    public void setButtonTwoText(String buttonTwoText) {
        this.buttonTwoText = buttonTwoText;
    }

    public String getButtonOneAction() {
        return buttonOneAction;
    }

    public void setButtonOneAction(String buttonOneAction) {
        this.buttonOneAction = buttonOneAction;
    }

    public String getButtonTwoAction() {
        return buttonTwoAction;
    }

    public void setButtonTwoAction(String buttonTwoAction) {
        this.buttonTwoAction = buttonTwoAction;
    }
}