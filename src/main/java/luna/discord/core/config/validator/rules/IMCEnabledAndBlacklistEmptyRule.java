package luna.discord.core.config.validator.rules;

import luna.discord.core.config.Configuration;
import luna.discord.core.config.validator.IConfigurationValidationRule;
import luna.discord.core.config.validator.ValidationResult;

public class IMCEnabledAndBlacklistEmptyRule implements IConfigurationValidationRule {
    private String getHint() {
        return "IMC is enabled and set to blacklist, but the blacklist is empty. Every mod can use IMC.";
    }

    @Override
    public ValidationResult validate() {
        boolean valid = !(Configuration.getConfig().imc.enabled
            && Configuration.getConfig().imc.mode.equals("blacklist")
            && Configuration.getConfig().imc.list.size() == 0);

        return valid ? new ValidationResult(true, null) : new ValidationResult(false, getHint());
    }
}
