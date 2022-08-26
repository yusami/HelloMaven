.PHONY: help all run clean
.DEFAULT_GOAL := run

help: ## Show help text
	@echo "Description:"
	@echo "  Quick build tool"
	@echo ""
	@echo "Commands:"
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "  \033[36m%-20s\033[0m %s\n", $$1, $$2}'

all: clean install run ## Install libs and run the script

install: ## Install libs
	@echo Nothing to do.

outdated: ## Show the outdated libs
	mvn versions:display-dependency-updates

run: ## Run the script (default)
	mvn clean pmd:pmd jacoco:prepare-agent test jacoco:report site

clean: ## Delete the existing libs
	mvn clean

