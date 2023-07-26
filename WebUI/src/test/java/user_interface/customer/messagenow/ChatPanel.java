package user_interface.customer.messagenow;

import net.serenitybdd.screenplay.targets.Target;

public class ChatPanel {

    //Chat Panel Footer Buttons
    public static Target UPLOAD_BUTTON = Target.the("Chat Panel Send a photo, video or file. footer button").locatedBy("css:button[data-testid=mn-footer_share_upload-button]");
    public static Target INVENTORY_BUTTON = Target.the("Chat Panel Inventory footer button").locatedBy("css:button[data-testid=mn-footer_inventory-button]");
    public static Target DIGITAL_BROCHURES_BUTTON = Target.the("Chat Panel Digital Brochures footer button").locatedBy("css:button[data-testid=mn-footer_digital_brochures-button]");
    public static Target TRADE_IN_BUTTON = Target.the("Chat Panel Trade-in footer button").locatedBy("css:button[data-testid=mn-footer_trade_in-button]");
    public static Target HOURS_BUTTON = Target.the("Chat Panel Hours footer button").locatedBy("css:button[data-testid=mn-footer_hours-button]");
    public static Target YOUR_INFO_BUTTON = Target.the("Chat Panel Your Info Button").locatedBy("css:button[data-testid=mn-footer_your_info-button]");
    public static Target INFO_BUTTON = Target.the("Chat Panel Info Button").locatedBy("css:button[data-testid=mn-footer_info-button]");
    public static Target CONNECT_ON_MOBILE_BUTTON = Target.the("Chat Panel Connect on Mobile Button").locatedBy("css:button[data-testid=mn-footer_send_to_mobile-button]");
    public static Target LANGUAGE_BUTTON = Target.the("Chat Panel Language Button").locatedBy("css:button[data-testid=mn-footer_language-button]");
    public static Target LEGAL_BUTTON = Target.the("Chat Panel Legal Button").locatedBy("css:button[data-testid=mn-footer_legal-button]");

    public static Target CHATPANEL_ENTER_YOUR_MESSAGE = Target.the("Chat Panel Enter Your Message").locatedBy("css: input[placeholder='Enter your message']");
    public static Target CHATPANEL_SEND_BUTTON = Target.the("Chat Panel Send Button").locatedBy("css: button[aria-label='Send']");



}
