import {GrowVerticalNav} from "grow-clay";
import React from 'react';

const Component = (props) => {
  const spritemap = Liferay.ThemeDisplay.getPathThemeImages() + '/lexicon/icons.svg';
  const items = [
		{label: props.data.creator + " " + props.data.creatorDate}, 
		{label: props.data.modifier + " " + props.data.modifierDate}
	];

  return (
    <GrowVerticalNav
      spritemap={spritemap}
      label="Contributors"
      labelIcon="users"
      items={items}
    />
  );
};

  export default function(props) {
	return (
		<Component data={props} />
	);
}
